
inherit dnf-bridge

PN = "unicode-emoji"
PE = "0"
PV = "15.1"
PR = "3.el10"
PACKAGES = "unicode-emoji"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/unicode-emoji-15.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_unicode-emoji = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/unicode-emoji-15.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_unicode-emoji}"
RDEPENDS:unicode-emoji = ""
