
inherit dnf-bridge

PN = "rust-sequoia-sq"
PE = "0"
PV = "1.3.0"
PR = "2.el10_0"
PACKAGES = "sequoia-sq"


URI_sequoia-sq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sequoia-sq-1.3.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sequoia-sq = " \
 glibc \
 sqlite-libs \
 openssl-libs \
 libgcc \
"
