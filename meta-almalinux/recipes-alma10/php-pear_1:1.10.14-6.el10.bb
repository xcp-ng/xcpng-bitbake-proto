
inherit dnf-bridge

PN = "php-pear"
PE = "1"
PV = "1.10.14"
PR = "6.el10"
PACKAGES = "php-pear"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/php-pear-1.10.14-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_php-pear = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pear-1.10.14-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_php-pear}"
RDEPENDS:php-pear = " \
 httpd-filesystem \
 php-process \
 php-xml \
 php-cli \
 php-common \
 bash \
"
