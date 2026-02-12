
inherit dnf-bridge

PN = "jakarta-mail"
PE = "0"
PV = "2.1.2"
PR = "6.el10"
PACKAGES = "jakarta-mail jakarta-mail-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jakarta-mail-2.1.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jakarta-mail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-mail-2.1.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-mail}"
RDEPENDS:jakarta-mail = " \
 jakarta-activation \
 javapackages-filesystem \
"

URI_jakarta-mail-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-mail-javadoc-2.1.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-mail-javadoc}"
RDEPENDS:jakarta-mail-javadoc = " \
 javapackages-filesystem \
"
