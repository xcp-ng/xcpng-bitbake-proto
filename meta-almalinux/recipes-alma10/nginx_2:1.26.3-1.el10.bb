
inherit dnf-bridge

PN = "nginx"
PE = "2"
PV = "1.26.3"
PR = "1.el10"
PACKAGES = "nginx nginx-all-modules nginx-core nginx-filesystem nginx-mod-http-image-filter nginx-mod-http-perl nginx-mod-http-xslt-filter nginx-mod-mail nginx-mod-stream nginx-mod-devel"


URI_nginx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx = " \
 systemd \
 almalinux-logos-httpd \
 bash \
 nginx-core \
 nginx-filesystem \
"

URI_nginx-all-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-all-modules-1.26.3-1.el10.noarch.rpm;unpack=0"
RDEPENDS:nginx-all-modules = " \
 nginx-mod-stream \
 nginx-mod-http-image-filter \
 nginx-mod-http-perl \
 nginx-mod-http-xslt-filter \
 nginx-mod-mail \
"

URI_nginx-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-core-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-core = " \
 zlib-ng-compat \
 libxcrypt \
 openssl-libs \
 pcre2 \
 glibc \
 nginx-filesystem \
"

URI_nginx-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-filesystem-1.26.3-1.el10.noarch.rpm;unpack=0"
RDEPENDS:nginx-filesystem = " \
 shadow-utils \
 bash \
"

URI_nginx-mod-http-image-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-mod-http-image-filter-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-http-image-filter = " \
 glibc \
 gd \
 nginx \
 bash \
"

URI_nginx-mod-http-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-mod-http-perl-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-http-perl = " \
 perl-constant \
 nginx \
 perl-libs \
 bash \
 glibc \
 perl-Exporter \
"

URI_nginx-mod-http-xslt-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-mod-http-xslt-filter-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-http-xslt-filter = " \
 nginx \
 libxslt \
 libxml2 \
 bash \
 glibc \
"

URI_nginx-mod-mail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-mod-mail-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-mail = " \
 glibc \
 nginx \
 bash \
"

URI_nginx-mod-stream = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nginx-mod-stream-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-stream = " \
 glibc \
 nginx \
 bash \
"

URI_nginx-mod-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nginx-mod-devel-1.26.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nginx-mod-devel = " \
 perl-constant \
 perl-ExtUtils-Embed \
 gd-devel \
 perl-libs \
 perl-interpreter \
 libxslt-devel \
 perl-devel \
 zlib-ng-compat-devel \
 make \
 pcre2-devel \
 openssl-devel \
 bash \
 gcc \
 nginx \
 perl-Exporter \
"
