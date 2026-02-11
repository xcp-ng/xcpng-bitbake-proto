
PN = "avahi"
PE = "0"
PV = "0.9~rc2"
PR = "1.el10_0.1"
PACKAGES = "avahi avahi-libs avahi-devel avahi-glib avahi-gobject avahi-tools avahi-compat-howl avahi-compat-howl-devel avahi-compat-libdns_sd avahi-compat-libdns_sd-devel avahi-glib-devel avahi-autoipd avahi-dnsconfd avahi-gobject-devel avahi-ui-devel avahi-ui-gtk3 avahi-ui-tools"


URI_avahi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/avahi-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi = "/bin/sh ( ) coreutils ( ) shadow-utils ( ) dbus ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcap.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libexpat.so.1()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) expat ( ) libdaemon.so.0()(64bit) ( ) libdaemon ( >=  0.11) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi = "libavahi-core.so.7()(64bit) ( ) avahi ( =  0.9~rc2-1.el10_0.1) avahi(x86-64) ( =  0.9~rc2-1.el10_0.1) config(avahi) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/avahi-libs-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libevent-2.1.so.7()(64bit) ( )"
RPROVIDES:avahi-libs = "libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-libevent.so.1()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-libs ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-devel = "/usr/bin/pkg-config ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-core.so.7()(64bit) ( ) pkgconfig(dbus-1) ( ) libavahi-libevent.so.1()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) pkgconfig(libevent) ( >=  2.1.5) avahi(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-devel = "pkgconfig(avahi-client) ( =  0.8) pkgconfig(avahi-core) ( =  0.8) pkgconfig(avahi-libevent) ( =  0.8) avahi-devel ( =  0.9~rc2-1.el10_0.1) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-glib-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-glib = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-glib = "libavahi-glib.so.1()(64bit) ( ) avahi-glib(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-glib ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-gobject-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-gobject = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-glib(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-gobject = "libavahi-gobject.so.0()(64bit) ( ) avahi-gobject ( =  0.9~rc2-1.el10_0.1) avahi-gobject(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/avahi-tools-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libgdbm.so.6()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-tools = "avahi-tools ( =  0.9~rc2-1.el10_0.1) avahi-tools(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-compat-howl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-howl-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-howl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-compat-howl = "libhowl.so.0()(64bit) ( ) avahi-compat-howl(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-compat-howl ( =  0.9~rc2-1.el10_0.1) howl-libs ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-compat-howl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-howl-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-howl-devel = "/usr/bin/pkg-config ( ) libhowl.so.0()(64bit) ( ) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-compat-howl(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-compat-howl-devel = "pkgconfig(avahi-compat-howl) ( =  0.9.8) pkgconfig(howl) ( =  0.9.8) avahi-compat-howl-devel ( =  0.9~rc2-1.el10_0.1) avahi-compat-howl-devel(x86-64) ( =  0.9~rc2-1.el10_0.1) howl-devel ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-compat-libdns_sd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-libdns_sd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-libdns_sd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-compat-libdns_sd = "libdns_sd.so.1()(64bit) ( ) avahi-compat-libdns_sd(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-compat-libdns_sd ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-compat-libdns_sd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-compat-libdns_sd-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-compat-libdns_sd-devel = "/usr/bin/pkg-config ( ) libdns_sd.so.1()(64bit) ( ) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-compat-libdns_sd(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-compat-libdns_sd-devel = "pkgconfig(avahi-compat-libdns_sd) ( =  0.8) pkgconfig(libdns_sd) ( =  0.8) avahi-compat-libdns_sd-devel ( =  0.9~rc2-1.el10_0.1) avahi-compat-libdns_sd-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/avahi-glib-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) glib2-devel ( ) libavahi-glib.so.1()(64bit) ( ) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-glib(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-glib-devel = "pkgconfig(avahi-glib) ( =  0.8) avahi-glib-devel ( =  0.9~rc2-1.el10_0.1) avahi-glib-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-autoipd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-autoipd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-autoipd = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdaemon.so.0()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-autoipd = "avahi-autoipd ( =  0.9~rc2-1.el10_0.1) avahi-autoipd(x86-64) ( =  0.9~rc2-1.el10_0.1) config(avahi-autoipd) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-dnsconfd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-dnsconfd-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-dnsconfd = "/bin/sh ( ) rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libdaemon.so.0()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-dnsconfd = "avahi-dnsconfd ( =  0.9~rc2-1.el10_0.1) avahi-dnsconfd(x86-64) ( =  0.9~rc2-1.el10_0.1) config(avahi-dnsconfd) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-gobject-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-gobject-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-gobject-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(avahi-client) ( ) pkgconfig(avahi-glib) ( ) libavahi-gobject.so.0()(64bit) ( ) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-gobject(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-gobject-devel = "pkgconfig(avahi-gobject) ( =  0.8) avahi-gobject-devel ( =  0.9~rc2-1.el10_0.1) avahi-gobject-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-ui-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-devel-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-devel = "/usr/bin/pkg-config ( ) libavahi-ui-gtk3.so.0()(64bit) ( ) pkgconfig(avahi-client) ( ) pkgconfig(avahi-glib) ( ) pkgconfig(gtk+-3.0) ( ) avahi-ui-gtk3(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-ui-devel = "pkgconfig(avahi-ui-gtk3) ( =  0.8) avahi-ui-devel ( =  0.9~rc2-1.el10_0.1) avahi-ui-devel(x86-64) ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-ui-gtk3 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-gtk3-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-gtk3 = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) gtk3 ( ) libgdbm.so.6()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-glib(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-ui-gtk3 = "libavahi-ui-gtk3.so.0()(64bit) ( ) avahi-ui-gtk3(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-ui-gtk3 ( =  0.9~rc2-1.el10_0.1)"

URI_avahi-ui-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/avahi-ui-tools-0.9~rc2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:avahi-ui-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) openssh-clients ( ) libavahi-ui-gtk3.so.0()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) gnome-connections ( ) libavahi-core.so.7()(64bit) ( ) avahi-libs(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi-ui-gtk3(x86-64) ( =  0.9~rc2-1.el10_0.1) avahi ( =  0.9~rc2-1.el10_0.1) avahi-glib(x86-64) ( =  0.9~rc2-1.el10_0.1)"
RPROVIDES:avahi-ui-tools = "application() ( ) application(bssh.desktop) ( ) application(bvnc.desktop) ( ) avahi-ui-tools ( =  0.9~rc2-1.el10_0.1) avahi-ui-tools(x86-64) ( =  0.9~rc2-1.el10_0.1)"
