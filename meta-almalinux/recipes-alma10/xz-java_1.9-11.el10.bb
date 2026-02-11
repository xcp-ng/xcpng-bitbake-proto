
PN = "xz-java"
PE = "0"
PV = "1.9"
PR = "11.el10"
PACKAGES = "xz-java xz-java-javadoc"


URI_xz-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xz-java-1.9-11.el10.noarch.rpm;unpack=0"
RDEPENDS:xz-java = " \
 javapackages-filesystem \
"

URI_xz-java-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xz-java-javadoc-1.9-11.el10.noarch.rpm;unpack=0"
RDEPENDS:xz-java-javadoc = " \
 javapackages-filesystem \
"
