# OVAL Interpreter
Terzi includes an OVAL (Open vulnerability and assessment language) interpreter, developed by VulnIQ. 
It supports only a limited number of OVAL tests and objects, mostly the ones required to run OVAL content from 
Linux vendors and CIS repository. 

**When used in standalone mode:**
It can load and run OVAL definitions (oval_definitions as defined by OVAL) from a local file or URL. For example 
if you have a running docker container on your machine named terzi-rhel7 and you want to quickly run a Red Hat OVAL 
advisory, you can simply run the following command:

<pre><code>bin/oval.sh -t Docker -n rhel7-container-name \
  -f https://www.redhat.com/security/data/oval/com.redhat.rhsa-20190049.xml</code></pre>

Or if you already downloaded Debian OVAL definitions, you can load and run definitions from the downloaded file. 
In the following example -o parameter instructs Terzi to run only a single definition with id 
oval:org.debian:def:20199956. Otherwise, when a definition id is not provided with -o, all definitions in the file will 
be run. (Note that Debian files contain hundreds if not thousands of definitions and it may take several minutes to run 
thousands of definitions.)

<pre><code>bin/oval.sh -t Docker -n a-debian9-container -f ~/Downloads/oval-definitions-stretch.xml \
  -o oval:org.debian:def:20199956</code></pre>

**When used together with VulnIQ engine:**
Terzi  can load OVAL definitions from VulnIQ engine. Instead of providing the entire oval_definitions file you just 
provide the oval id and Terzi automatically downloads all necessary data from VulnIQ engine itself. 
When running vulnerability scans:
1. Terzi first determines the list of vulnerabilities by using version numbers and utilizing VulnIQ APIs 
2. In the next step Terzi fetches the necessary OVAL data from VulnIQ engine and verifies the vulnerabilities to 
provide you with the most accurate results. Most other solutions, report vulnerabilities based only on version numbers 
but VulnIQ solution ensures high accuracy by running additional checks, such as OVAL checks.
