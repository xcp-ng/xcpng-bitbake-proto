
PN = "ongres-stringprep"
PE = "0"
PV = "1.1"
PR = "16.el10"
PACKAGES = "ongres-stringprep ongres-stringprep-javadoc"


URI_ongres-stringprep = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ongres-stringprep-1.1-16.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-stringprep = "
 javapackages-filesystem
"

URI_ongres-stringprep-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ongres-stringprep-javadoc-1.1-16.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-stringprep-javadoc = "
 javapackages-filesystem
"
