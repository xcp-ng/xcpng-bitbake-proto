
inherit dnf-bridge

PN = "php-pecl-redis6"
PE = "0"
PV = "6.1.0"
PR = "2.el10"
PACKAGES = "php-pecl-redis6"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/php-pecl-redis6-6.1.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_php-pecl-redis6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-redis6-6.1.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pecl-redis6}"
RDEPENDS:php-pecl-redis6 = " \
 glibc \
 lz4-libs \
 php-common \
 libzstd \
"
