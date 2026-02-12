
inherit dnf-bridge

PN = "hunspell-oc"
PE = "0"
PV = "1.5"
PR = "6.el10"
PACKAGES = "hunspell-oc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-oc-1.5-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-oc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-oc-1.5-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-oc}"
RDEPENDS:hunspell-oc = " \
 hunspell \
"
