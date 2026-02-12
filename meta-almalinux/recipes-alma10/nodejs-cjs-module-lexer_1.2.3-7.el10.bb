
inherit dnf-bridge

PN = "nodejs-cjs-module-lexer"
PE = "0"
PV = "1.2.3"
PR = "7.el10"
PACKAGES = "nodejs-cjs-module-lexer"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/nodejs-cjs-module-lexer-1.2.3-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nodejs-cjs-module-lexer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-cjs-module-lexer-1.2.3-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_nodejs-cjs-module-lexer}"
RDEPENDS:nodejs-cjs-module-lexer = " \
 nodejs \
"
