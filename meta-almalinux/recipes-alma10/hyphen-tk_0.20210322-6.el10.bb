
inherit dnf-bridge

PN = "hyphen-tk"
PE = "0"
PV = "0.20210322"
PR = "6.el10"
PACKAGES = "hyphen-tk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-tk-0.20210322-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-tk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-tk-0.20210322-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-tk}"
RDEPENDS:hyphen-tk = " \
 hyphen \
"
