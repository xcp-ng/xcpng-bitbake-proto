
inherit dnf-bridge

PN = "nodejs-nodemon"
PE = "0"
PV = "3.0.3"
PR = "5.el10"
PACKAGES = "nodejs-nodemon"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/nodejs-nodemon-3.0.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nodejs-nodemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-nodemon-3.0.3-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_nodejs-nodemon}"
RDEPENDS:nodejs-nodemon = " \
 nodejs \
"
