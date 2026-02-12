
inherit dnf-bridge

PN = "almalinux-indexhtml"
PE = "0"
PV = "10"
PR = "3.el10"
PACKAGES = "almalinux-indexhtml"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/almalinux-indexhtml-10-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_almalinux-indexhtml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-indexhtml-10-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_almalinux-indexhtml}"
RDEPENDS:almalinux-indexhtml = ""
