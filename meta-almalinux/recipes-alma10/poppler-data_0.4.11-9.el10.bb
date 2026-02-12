
inherit dnf-bridge

PN = "poppler-data"
PE = "0"
PV = "0.4.11"
PR = "9.el10"
PACKAGES = "poppler-data poppler-data-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/poppler-data-0.4.11-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_poppler-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-data-0.4.11-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_poppler-data}"
RDEPENDS:poppler-data = ""

URI_poppler-data-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-data-devel-0.4.11-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_poppler-data-devel}"
RDEPENDS:poppler-data-devel = " \
 poppler-data \
 pkgconf-pkg-config \
"
