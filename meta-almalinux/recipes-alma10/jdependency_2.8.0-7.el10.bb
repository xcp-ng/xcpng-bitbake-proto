
PN = "jdependency"
PE = "0"
PV = "2.8.0"
PR = "7.el10"
PACKAGES = "jdependency jdependency-javadoc"


URI_jdependency = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jdependency-2.8.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jdependency = "
 objectweb-asm
 apache-commons-io
 javapackages-filesystem
 java-21-openjdk-headless
"

URI_jdependency-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jdependency-javadoc-2.8.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jdependency-javadoc = "
 javapackages-filesystem
"
