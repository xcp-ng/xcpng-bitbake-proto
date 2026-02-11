
PN = "jaxb-fi"
PE = "0"
PV = "2.1.1"
PR = "7.el10"
PACKAGES = "jaxb-fi jaxb-fi-javadoc jaxb-fi-tests"


URI_jaxb-fi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi = " \
 javapackages-filesystem \
"

URI_jaxb-fi-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-javadoc-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi-javadoc = " \
 javapackages-filesystem \
"

URI_jaxb-fi-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-tests-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi-tests = " \
 jaxb-fi \
 javapackages-filesystem \
"
