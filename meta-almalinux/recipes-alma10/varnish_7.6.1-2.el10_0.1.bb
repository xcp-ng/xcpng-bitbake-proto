
inherit dnf-bridge

PN = "varnish"
PE = "0"
PV = "7.6.1"
PR = "2.el10_0.1"
PACKAGES = "varnish varnish-docs varnish-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/varnish-7.6.1-2.el10_0.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_varnish = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/varnish-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_varnish}"
RDEPENDS:varnish = " \
 logrotate \
 shadow-utils \
 systemd \
 util-linux \
 redhat-rpm-config \
 libgcc \
 ncurses \
 bash \
 ncurses-libs \
 pcre2 \
 gcc \
 glibc \
 libedit \
"

URI_varnish-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/varnish-docs-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_varnish-docs}"
RDEPENDS:varnish-docs = ""

URI_varnish-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/varnish-devel-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_varnish-devel}"
RDEPENDS:varnish-devel = " \
 python3 \
 pkgconf-pkg-config \
 varnish \
"
