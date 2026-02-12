
inherit dnf-bridge

PN = "almalinux-bookmarks"
PE = "0"
PV = "10"
PR = "1.el10"
PACKAGES = "almalinux-bookmarks"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/almalinux-bookmarks-10-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_almalinux-bookmarks = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/almalinux-bookmarks-10-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_almalinux-bookmarks}"
RDEPENDS:almalinux-bookmarks = ""
