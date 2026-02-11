
inherit dnf-bridge

PN = "libreport"
PE = "0"
PV = "2.17.14"
PR = "2.el10"
PACKAGES = "libreport libreport-anaconda libreport-centos libreport-cli libreport-devel libreport-filesystem libreport-gtk libreport-gtk-devel libreport-newt libreport-plugin-bugzilla libreport-plugin-kerneloops libreport-plugin-logger libreport-plugin-mailx libreport-plugin-mantisbt libreport-plugin-reportuploader libreport-plugin-systemd-journal libreport-plugin-ureport libreport-web libreport-web-devel python3-libreport"


URI_libreport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport = " \
 systemd-libs \
 libarchive \
 augeas-libs \
 satyr \
 libgcc \
 json-c \
 glib2 \
 glibc \
 libreport-filesystem \
"

URI_libreport-anaconda = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-anaconda-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-anaconda = " \
 libreport \
 libreport-plugin-reportuploader \
"

URI_libreport-centos = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-centos-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-centos = " \
 libreport \
 libreport-web \
 libreport-plugin-mantisbt \
"

URI_libreport-cli = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-cli-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-cli = " \
 glibc \
 libreport \
 libgcc \
 glib2 \
"

URI_libreport-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-devel = " \
 libreport \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_libreport-filesystem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-filesystem-2.17.14-2.el10.noarch.rpm;unpack=0"
RDEPENDS:libreport-filesystem = ""

URI_libreport-gtk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-gtk-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-gtk = " \
 atk \
 systemd-libs \
 libarchive \
 cairo-gobject \
 augeas-libs \
 satyr \
 libreport-plugin-reportuploader \
 libgcc \
 json-c \
 harfbuzz \
 pango \
 gdk-pixbuf2 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 libreport \
"

URI_libreport-gtk-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-gtk-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-gtk-devel = " \
 libreport-devel \
 pkgconf-pkg-config \
 libreport-gtk \
"

URI_libreport-newt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-newt-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-newt = " \
 newt \
 libgcc \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-plugin-bugzilla = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-bugzilla-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-bugzilla = " \
 python3 \
 xmlrpc-c \
 xmlrpc-c-client \
 libreport-web \
 libgcc \
 python3-libreport \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-plugin-kerneloops = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-kerneloops-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-kerneloops = " \
 libreport-web \
 libgcc \
 curl \
 glib2 \
 libcurl \
 glibc \
 libreport \
"

URI_libreport-plugin-logger = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-logger-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-logger = " \
 glibc \
 libreport \
 libgcc \
 glib2 \
"

URI_libreport-plugin-mailx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-mailx-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-mailx = " \
 libgcc \
 glib2 \
 glibc \
 libreport \
 s-nail \
"

URI_libreport-plugin-mantisbt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-mantisbt-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-mantisbt = " \
 libreport-web \
 libgcc \
 libxml2 \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-plugin-reportuploader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-reportuploader-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-reportuploader = " \
 libreport-web \
 libgcc \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-plugin-systemd-journal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-systemd-journal-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-systemd-journal = " \
 systemd-libs \
 libgcc \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-plugin-ureport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-ureport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-ureport = " \
 libreport-web \
 libgcc \
 glib2 \
 glibc \
 libreport \
"

URI_libreport-web = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-web-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-web = " \
 xmlrpc-c \
 systemd-libs \
 libarchive \
 xmlrpc-c-client \
 augeas-libs \
 satyr \
 libgcc \
 json-c \
 libxml2 \
 glib2 \
 libcurl \
 glibc \
 libreport \
"

URI_libreport-web-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-web-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-web-devel = " \
 libxml2-devel \
 glib2-devel \
 xmlrpc-c-devel \
 libreport-web \
 satyr-devel \
 pkgconf-pkg-config \
 libcurl-devel \
 libreport-devel \
 json-c-devel \
"

URI_python3-libreport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libreport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libreport = " \
 python3-urllib3 \
 python3 \
 python3-requests \
 systemd-libs \
 libarchive \
 augeas-libs \
 satyr \
 libgcc \
 json-c \
 python3-dnf \
 glib2 \
 glibc \
 libreport \
"
