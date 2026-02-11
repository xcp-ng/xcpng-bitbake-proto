
PN = "javapackages-tools"
PE = "0"
PV = "6.4.0"
PR = "1.el10"
PACKAGES = "javapackages-filesystem javapackages-tools javapackages-common javapackages-compat javapackages-generators javapackages-local-openjdk21 maven-local-openjdk21 python3-javapackages"


URI_javapackages-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/javapackages-filesystem-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-filesystem = ""
RPROVIDES:javapackages-filesystem = "rpm_macro(_ivyxmldir) ( ) rpm_macro(_javaconfdir) ( ) rpm_macro(_javadir) ( ) rpm_macro(_javadocdir) ( ) rpm_macro(_jnidir) ( ) rpm_macro(_jpbindingdir) ( ) rpm_macro(_jvmcommondatadir) ( ) rpm_macro(_jvmcommonlibdir) ( ) rpm_macro(_jvmcommonsysconfdir) ( ) rpm_macro(_jvmdatadir) ( ) rpm_macro(_jvmdir) ( ) rpm_macro(_jvmlibdir) ( ) rpm_macro(_jvmprivdir) ( ) rpm_macro(_jvmsysconfdir) ( ) rpm_macro(_mavenpomdir) ( ) javapackages-filesystem ( =  6.4.0-1.el10) eclipse-filesystem ( =  6.4.0-1.el10)"

URI_javapackages-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/javapackages-tools-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-tools = "/bin/sh ( ) coreutils ( ) findutils ( ) javapackages-filesystem ( =  6.4.0-1.el10)"
RPROVIDES:javapackages-tools = "rpm_macro(ant) ( ) rpm_macro(jar) ( ) rpm_macro(java) ( ) rpm_macro(javac) ( ) rpm_macro(javadoc) ( ) rpm_macro(jp_binding) ( ) rpm_macro(jpackage_script) ( ) config(javapackages-tools) ( =  6.4.0-1.el10) javapackages-tools ( =  6.4.0-1.el10) jpackage-utils ( =  6.4.0-1.el10)"

URI_javapackages-common = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-common-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-common = "javapackages-generators ( =  6.4.0-1.el10)"
RPROVIDES:javapackages-common = "rpm_macro(gradle_build) ( ) rpm_macro(javadoc_package) ( ) rpm_macro(mvn_alias) ( ) rpm_macro(mvn_artifact) ( ) rpm_macro(mvn_build) ( ) rpm_macro(mvn_compat_version) ( ) rpm_macro(mvn_config) ( ) rpm_macro(mvn_file) ( ) rpm_macro(mvn_install) ( ) rpm_macro(mvn_package) ( ) rpm_macro(mvn_subst) ( ) rpm_macro(pom_add_dep) ( ) rpm_macro(pom_add_dep_mgmt) ( ) rpm_macro(pom_add_parent) ( ) rpm_macro(pom_add_plugin) ( ) rpm_macro(pom_change_dep) ( ) rpm_macro(pom_disable_module) ( ) rpm_macro(pom_remove_dep) ( ) rpm_macro(pom_remove_parent) ( ) rpm_macro(pom_remove_plugin) ( ) rpm_macro(pom_set_parent) ( ) rpm_macro(pom_xpath_disable) ( ) rpm_macro(pom_xpath_inject) ( ) rpm_macro(pom_xpath_remove) ( ) rpm_macro(pom_xpath_replace) ( ) rpm_macro(pom_xpath_set) ( ) javapackages-common ( =  6.4.0-1.el10)"

URI_javapackages-compat = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-compat-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-compat = "javapackages-local ( =  6.4.0-1.el10)"
RPROVIDES:javapackages-compat = "rpm_macro(add_maven_depmap) ( ) rpm_macro(mvn_install_pom) ( ) javapackages-compat ( =  6.4.0-1.el10)"

URI_javapackages-generators = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-generators-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-generators = "/usr/bin/python3 ( ) javapackages-tools ( =  6.4.0-1.el10) python3-javapackages ( =  6.4.0-1.el10)"
RPROVIDES:javapackages-generators = "javapackages-generators ( =  6.4.0-1.el10) config(javapackages-generators) ( =  6.4.0-1.el10)"

URI_javapackages-local-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-local-openjdk21-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-local-openjdk21 = "java-21-openjdk-devel ( ) xmvn-generator ( ) xmvn-tools ( ) javapackages-common ( =  6.4.0-1.el10) ant-openjdk21 ( if  ant)"
RPROVIDES:javapackages-local-openjdk21 = "rpm_macro(java_home) ( ) javapackages-local ( =  6.4.0-1.el10) javapackages-local-openjdk21 ( =  6.4.0-1.el10)"

URI_maven-local-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-local-openjdk21-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-local-openjdk21 = "java-21-openjdk-devel ( ) mvn(org.apache.maven.plugins:maven-jar-plugin) ( ) xmvn-minimal ( ) mvn(org.apache.maven.plugins:maven-compiler-plugin) ( ) mvn(org.apache.maven.plugins:maven-surefire-plugin) ( ) xmvn-toolchain-openjdk21 ( ) mvn(org.apache.maven.plugins:maven-resources-plugin) ( ) mvn(org.fedoraproject.xmvn:xmvn-mojo) ( ) javapackages-tools ( =  6.4.0-1.el10) javapackages-local-openjdk21 ( =  6.4.0-1.el10)"
RPROVIDES:maven-local-openjdk21 = "maven-local ( =  6.4.0-1.el10) maven-local-openjdk21 ( =  6.4.0-1.el10)"

URI_python3-javapackages = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-javapackages-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-javapackages = "python3-lxml ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-javapackages = "python3-javapackages ( =  6.4.0-1.el10) python-javapackages ( =  6.4.0-1.el10) python3.12-javapackages ( =  6.4.0-1.el10) python3.12dist(javapackages) ( =  6.4) python3dist(javapackages) ( =  6.4)"
