
inherit dnf-bridge

PN = "nodejs-undici"
PE = "0"
PV = "6.11.1"
PR = "3.el10"
PACKAGES = "nodejs-undici"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/nodejs-undici-6.11.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nodejs-undici = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-undici-6.11.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_nodejs-undici}"
RDEPENDS:nodejs-undici = ""
