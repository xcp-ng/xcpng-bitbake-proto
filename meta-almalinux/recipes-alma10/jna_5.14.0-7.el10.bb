
PN = "jna"
PE = "0"
PV = "5.14.0"
PR = "7.el10"
PACKAGES = "jna jna-contrib jna-javadoc"


URI_jna = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jna-5.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jna = "
 glibc
 libffi
 javapackages-filesystem
"

URI_jna-contrib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jna-contrib-5.14.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jna-contrib = "
 jna
 javapackages-filesystem
"

URI_jna-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jna-javadoc-5.14.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jna-javadoc = "
 javapackages-filesystem
"
