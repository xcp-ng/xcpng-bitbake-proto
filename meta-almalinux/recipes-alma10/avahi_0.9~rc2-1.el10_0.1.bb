
inherit dnf-bridge

PN = "avahi"
PE = "0"
PV = "0.9~rc2"
PR = "1.el10_0.1"
PACKAGES = "avahi avahi-libs avahi-devel avahi-glib avahi-gobject avahi-tools avahi-compat-howl avahi-compat-howl-devel avahi-compat-libdns_sd avahi-compat-libdns_sd-devel avahi-glib-devel avahi-autoipd avahi-dnsconfd avahi-gobject-devel avahi-ui-devel avahi-ui-gtk3 avahi-ui-tools"


URI_avahi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/avahi-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi = " \
 shadow-utils \
 systemd-libs \
 libcap \
 libdaemon \
 avahi-libs \
 bash \
 dbus \
 expat \
 glibc \
 coreutils \
 dbus-libs \
"

URI_avahi-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/avahi-libs-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-libs = " \
 glibc \
 dbus-libs \
 libevent \
"

URI_avahi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-devel = " \
 pkgconf-pkg-config \
 avahi \
 avahi-libs \
 dbus-devel \
 libevent-devel \
"

URI_avahi-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-glib-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-glib = " \
 glibc \
 avahi-libs \
 glib2 \
"

URI_avahi-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-gobject-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-gobject = " \
 avahi-glib \
 avahi-libs \
 glib2 \
 glibc \
 dbus-libs \
"

URI_avahi-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-tools-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-tools = " \
 glibc \
 avahi-libs \
 avahi \
 gdbm-libs \
"

URI_avahi-compat-howl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-howl-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-howl = " \
 glibc \
 avahi-libs \
 dbus-libs \
"

URI_avahi-compat-howl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-howl-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-howl-devel = " \
 avahi-compat-howl \
 avahi-devel \
 pkgconf-pkg-config \
"

URI_avahi-compat-libdns_sd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-libdns_sd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-libdns_sd = " \
 glibc \
 avahi-libs \
 dbus-libs \
"

URI_avahi-compat-libdns_sd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-libdns_sd-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-libdns_sd-devel = " \
 avahi-devel \
 avahi-compat-libdns_sd \
 pkgconf-pkg-config \
"

URI_avahi-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-glib-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-glib-devel = " \
 avahi-glib \
 glib2-devel \
 pkgconf-pkg-config \
 avahi-devel \
"

URI_avahi-autoipd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-autoipd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-autoipd = " \
 shadow-utils \
 avahi-libs \
 bash \
 glibc \
 libdaemon \
"

URI_avahi-dnsconfd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-dnsconfd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-dnsconfd = " \
 avahi \
 avahi-libs \
 bash \
 glibc \
 libdaemon \
"

URI_avahi-gobject-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-gobject-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-gobject-devel = " \
 glib2-devel \
 avahi-devel \
 pkgconf-pkg-config \
 avahi-gobject \
 avahi-glib-devel \
"

URI_avahi-ui-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-devel = " \
 avahi-devel \
 pkgconf-pkg-config \
 avahi-glib-devel \
 gtk3-devel \
 avahi-ui-gtk3 \
"

URI_avahi-ui-gtk3 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-gtk3-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-gtk3 = " \
 atk \
 cairo-gobject \
 harfbuzz \
 avahi-glib \
 pango \
 gdk-pixbuf2 \
 gdbm-libs \
 avahi-libs \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 dbus-libs \
"

URI_avahi-ui-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-tools-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-tools = " \
 openssh-clients \
 gnome-connections \
 avahi-glib \
 avahi \
 avahi-libs \
 glib2 \
 gtk3 \
 glibc \
 avahi-ui-gtk3 \
"
