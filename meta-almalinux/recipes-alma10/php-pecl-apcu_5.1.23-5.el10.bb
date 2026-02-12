
inherit dnf-bridge

PN = "php-pecl-apcu"
PE = "0"
PV = "5.1.23"
PR = "5.el10"
PACKAGES = "apcu-panel php-pecl-apcu php-pecl-apcu-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/php-pecl-apcu-5.1.23-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apcu-panel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apcu-panel-5.1.23-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apcu-panel}"
RDEPENDS:apcu-panel = " \
 php-fpm \
 php-gd \
 php-pecl-apcu \
 httpd \
"

URI_php-pecl-apcu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-apcu-5.1.23-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pecl-apcu}"
RDEPENDS:php-pecl-apcu = " \
 glibc \
 php-common \
"

URI_php-pecl-apcu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-apcu-devel-5.1.23-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pecl-apcu-devel}"
RDEPENDS:php-pecl-apcu-devel = " \
 php-pecl-apcu \
 php-devel \
"
