
inherit dnf-bridge

PN = "php-pecl-zip"
PE = "0"
PV = "1.22.3"
PR = "5.el10"
PACKAGES = "php-pecl-zip"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/php-pecl-zip-1.22.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_php-pecl-zip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-zip-1.22.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pecl-zip}"
RDEPENDS:php-pecl-zip = " \
 glibc \
 libzip \
 php-common \
"
