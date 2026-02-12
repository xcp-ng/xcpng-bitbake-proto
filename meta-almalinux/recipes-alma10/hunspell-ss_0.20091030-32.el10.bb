
inherit dnf-bridge

PN = "hunspell-ss"
PE = "0"
PV = "0.20091030"
PR = "32.el10"
PACKAGES = "hunspell-ss"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ss-0.20091030-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ss-0.20091030-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ss}"
RDEPENDS:hunspell-ss = " \
 hunspell \
"
