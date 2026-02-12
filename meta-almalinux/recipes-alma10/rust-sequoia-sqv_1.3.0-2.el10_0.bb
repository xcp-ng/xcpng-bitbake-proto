
inherit dnf-bridge

PN = "rust-sequoia-sqv"
PE = "0"
PV = "1.3.0"
PR = "2.el10_0"
PACKAGES = "sequoia-sqv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rust-sequoia-sqv-1.3.0-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sequoia-sqv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sequoia-sqv-1.3.0-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sequoia-sqv}"
RDEPENDS:sequoia-sqv = " \
 glibc \
 openssl-libs \
 libgcc \
"
