
inherit dnf-bridge

PN = "words"
PE = "0"
PV = "3.0"
PR = "47.el10"
PACKAGES = "words"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/words-3.0-47.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_words = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/words-3.0-47.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_words}"
RDEPENDS:words = ""
