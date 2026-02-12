
inherit dnf-bridge

PN = "rust-zram-generator"
PE = "0"
PV = "1.1.2"
PR = "14.el10"
PACKAGES = "zram-generator zram-generator-defaults"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rust-zram-generator-1.1.2-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_zram-generator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zram-generator-1.1.2-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zram-generator}"
RDEPENDS:zram-generator = " \
 glibc \
 libgcc \
"

URI_zram-generator-defaults = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/zram-generator-defaults-1.1.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_zram-generator-defaults}"
RDEPENDS:zram-generator-defaults = " \
 zram-generator \
"
