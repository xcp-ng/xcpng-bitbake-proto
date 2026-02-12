
inherit dnf-bridge

PN = "iso-codes"
PE = "0"
PV = "4.16.0"
PR = "6.el10"
PACKAGES = "iso-codes iso-codes-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/iso-codes-4.16.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iso-codes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iso-codes-4.16.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_iso-codes}"
RDEPENDS:iso-codes = " \
 xml-common \
"

URI_iso-codes-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iso-codes-devel-4.16.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_iso-codes-devel}"
RDEPENDS:iso-codes-devel = " \
 pkgconf-pkg-config \
 iso-codes \
"
