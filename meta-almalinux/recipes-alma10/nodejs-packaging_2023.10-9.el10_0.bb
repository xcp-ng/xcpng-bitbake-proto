
inherit dnf-bridge

PN = "nodejs-packaging"
PE = "0"
PV = "2023.10"
PR = "9.el10_0"
PACKAGES = "nodejs-packaging nodejs-packaging-bundler"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/nodejs-packaging-2023.10-9.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nodejs-packaging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-packaging-2023.10-9.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_nodejs-packaging}"
RDEPENDS:nodejs-packaging = " \
 python3 \
 redhat-rpm-config \
"

URI_nodejs-packaging-bundler = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-packaging-bundler-2023.10-9.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_nodejs-packaging-bundler}"
RDEPENDS:nodejs-packaging-bundler = " \
 jq \
 bash \
 coreutils \
 nodejs-npm \
 findutils \
"
