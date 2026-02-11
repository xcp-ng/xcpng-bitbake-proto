
inherit dnf-bridge

PN = "web-assets"
PE = "0"
PV = "5"
PR = "23.el10"
PACKAGES = "web-assets-filesystem web-assets-devel web-assets-httpd web-assets-nginx"


URI_web-assets-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/web-assets-filesystem-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-filesystem = " \
 fonts-filesystem \
"

URI_web-assets-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-devel-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-devel = " \
 web-assets-filesystem \
"

URI_web-assets-httpd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-httpd-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-httpd = " \
 bash \
 web-assets-filesystem \
 httpd \
"

URI_web-assets-nginx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-nginx-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-nginx = " \
 nginx \
 bash \
 web-assets-filesystem \
"
