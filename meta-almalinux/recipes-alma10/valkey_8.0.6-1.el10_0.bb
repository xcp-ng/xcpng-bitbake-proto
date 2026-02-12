
inherit dnf-bridge

PN = "valkey"
PE = "0"
PV = "8.0.6"
PR = "1.el10_0"
PACKAGES = "valkey valkey-devel valkey-compat-redis"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/valkey-8.0.6-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_valkey = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valkey-8.0.6-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valkey}"
RDEPENDS:valkey = " \
 logrotate \
 systemd-libs \
 openssl-libs \
 bash \
 glibc \
"

URI_valkey-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valkey-devel-8.0.6-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valkey-devel}"
RDEPENDS:valkey-devel = ""

URI_valkey-compat-redis = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/valkey-compat-redis-8.0.6-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_valkey-compat-redis}"
RDEPENDS:valkey-compat-redis = " \
 valkey \
 bash \
"
