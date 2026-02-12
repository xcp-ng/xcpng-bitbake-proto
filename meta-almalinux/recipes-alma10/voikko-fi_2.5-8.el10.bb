
inherit dnf-bridge

PN = "voikko-fi"
PE = "0"
PV = "2.5"
PR = "8.el10"
PACKAGES = "voikko-fi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/voikko-fi-2.5-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_voikko-fi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/voikko-fi-2.5-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_voikko-fi}"
RDEPENDS:voikko-fi = " \
 libvoikko \
"
