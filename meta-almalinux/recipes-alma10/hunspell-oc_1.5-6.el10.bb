
inherit dnf-bridge

PN = "hunspell-oc"
PE = "0"
PV = "1.5"
PR = "6.el10"
PACKAGES = "hunspell-oc"


URI_hunspell-oc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-oc-1.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-oc = " \
 hunspell \
"
