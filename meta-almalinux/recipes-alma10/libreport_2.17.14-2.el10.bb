
PN = "libreport"
PE = "0"
PV = "2.17.14"
PR = "2.el10"
PACKAGES = "libreport libreport-anaconda libreport-centos libreport-cli libreport-devel libreport-filesystem libreport-gtk libreport-gtk-devel libreport-newt libreport-plugin-bugzilla libreport-plugin-kerneloops libreport-plugin-logger libreport-plugin-mailx libreport-plugin-mantisbt libreport-plugin-reportuploader libreport-plugin-systemd-journal libreport-plugin-ureport libreport-web libreport-web-devel python3-libreport"


URI_libreport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libarchive.so.13()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libsatyr.so.4()(64bit) ( ) libarchive(x86-64) ( ) libaugeas.so.0()(64bit) ( ) libaugeas.so.0(AUGEAS_0.1.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.10.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.8.0)(64bit) ( ) glib2(x86-64) ( >=  2.43.4) libreport-filesystem ( =  2.17.14-2.el10) satyr(x86-64) ( >=  0.38)"
RPROVIDES:libreport = "libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10) config(libreport) ( =  2.17.14-2.el10) libreport(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-anaconda = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-anaconda-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-anaconda = "libreport ( =  2.17.14-2.el10) libreport-plugin-reportuploader ( =  2.17.14-2.el10)"
RPROVIDES:libreport-anaconda = "config(libreport-anaconda) ( =  2.17.14-2.el10) libreport-anaconda ( =  2.17.14-2.el10) libreport-anaconda(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-centos = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-centos-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-centos = "libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10) libreport-plugin-mantisbt ( =  2.17.14-2.el10)"
RPROVIDES:libreport-centos = "config(libreport-centos) ( =  2.17.14-2.el10) libreport-centos ( =  2.17.14-2.el10) libreport-centos(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-cli = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-cli-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-cli = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-cli = "libreport-cli ( =  2.17.14-2.el10) libreport-cli(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libreport.so.2()(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-devel = "libreport-devel ( =  2.17.14-2.el10) libreport-devel(x86-64) ( =  2.17.14-2.el10) pkgconfig(libreport) ( =  2.17.14)"

URI_libreport-filesystem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-filesystem-2.17.14-2.el10.noarch.rpm;unpack=0"
RDEPENDS:libreport-filesystem = ""
RPROVIDES:libreport-filesystem = "libreport-filesystem ( =  2.17.14-2.el10)"

URI_libreport-gtk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-gtk-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-gtk = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libarchive.so.13()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libsatyr.so.4()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libaugeas.so.0()(64bit) ( ) libreport ( =  2.17.14-2.el10) libreport-plugin-reportuploader ( =  2.17.14-2.el10)"
RPROVIDES:libreport-gtk = "libreport-gtk.so.1()(64bit) ( ) libreport-gtk.so.1(LIBREPORT_GTK_2.13.1)(64bit) ( ) libreport-gtk ( =  2.17.14-2.el10) libreport-gtk(x86-64) ( =  2.17.14-2.el10) report-gtk ( =  0.23-1)"

URI_libreport-gtk-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-gtk-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-gtk-devel = "/usr/bin/pkg-config ( ) pkgconfig(libreport) ( ) libreport-gtk.so.1()(64bit) ( ) libreport-gtk ( =  2.17.14-2.el10)"
RPROVIDES:libreport-gtk-devel = "libreport-gtk-devel ( =  2.17.14-2.el10) libreport-gtk-devel(x86-64) ( =  2.17.14-2.el10) pkgconfig(libreport-gtk) ( =  2.17.14)"

URI_libreport-newt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-newt-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-newt = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libnewt.so.0.52()(64bit) ( ) libnewt.so.0.52(NEWT_0.52)(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-newt = "libreport-newt ( =  2.17.14-2.el10) libreport-newt(x86-64) ( =  2.17.14-2.el10) report-newt ( =  0.23-1)"

URI_libreport-plugin-bugzilla = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-bugzilla-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-bugzilla = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libxmlrpc.so.3()(64bit) ( ) libxmlrpc_util.so.4()(64bit) ( ) libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) libxmlrpc_client.so.3()(64bit) ( ) libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10) python3-libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-bugzilla = "config(libreport-plugin-bugzilla) ( =  2.17.14-2.el10) libreport-plugin-bugzilla ( =  2.17.14-2.el10) libreport-plugin-bugzilla(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-kerneloops = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-kerneloops-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-kerneloops = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libcurl.so.4()(64bit) ( ) libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) curl ( ) libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-kerneloops = "libreport-plugin-kerneloops ( =  2.17.14-2.el10) libreport-plugin-kerneloops(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-logger = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-logger-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-logger = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-logger = "config(libreport-plugin-logger) ( =  2.17.14-2.el10) libreport-plugin-logger ( =  2.17.14-2.el10) libreport-plugin-logger(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-mailx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-mailx-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-mailx = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) /usr/bin/mailx ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-mailx = "config(libreport-plugin-mailx) ( =  2.17.14-2.el10) libreport-plugin-mailx ( =  2.17.14-2.el10) libreport-plugin-mailx(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-mantisbt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-mantisbt-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-mantisbt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-mantisbt = "libreport-plugin-mantisbt ( =  2.17.14-2.el10) config(libreport-plugin-mantisbt) ( =  2.17.14-2.el10) libreport-plugin-mantisbt(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-reportuploader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-reportuploader-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-reportuploader = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-reportuploader = "libreport-plugin-reportuploader ( =  2.17.14-2.el10) config(libreport-plugin-reportuploader) ( =  2.17.14-2.el10) libreport-plugin-reportuploader(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-systemd-journal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-systemd-journal-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-systemd-journal = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-systemd-journal = "libreport-plugin-systemd-journal ( =  2.17.14-2.el10) libreport-plugin-systemd-journal(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-plugin-ureport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-plugin-ureport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-plugin-ureport = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) libreport ( =  2.17.14-2.el10) libreport-web ( =  2.17.14-2.el10)"
RPROVIDES:libreport-plugin-ureport = "config(libreport-plugin-ureport) ( =  2.17.14-2.el10) libreport-plugin-ureport ( =  2.17.14-2.el10) libreport-plugin-ureport(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-web = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-web-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-web = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libarchive.so.13()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libxmlrpc.so.3()(64bit) ( ) libxmlrpc_util.so.4()(64bit) ( ) libcurl.so.4()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libsatyr.so.4()(64bit) ( ) libxmlrpc_client.so.3()(64bit) ( ) libaugeas.so.0()(64bit) ( ) libxmlrpc_xmlparse.so.3()(64bit) ( ) libxmlrpc_xmltok.so.3()(64bit) ( ) libreport ( =  2.17.14-2.el10)"
RPROVIDES:libreport-web = "libreport-web.so.2()(64bit) ( ) libreport-web.so.2(LIBREPORT_WEB_2.13.1)(64bit) ( ) libreport-web ( =  2.17.14-2.el10) libreport-web(x86-64) ( =  2.17.14-2.el10)"

URI_libreport-web-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libreport-web-devel-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libreport-web-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libreport-web.so.2()(64bit) ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(libreport) ( ) pkgconfig(xmlrpc) ( ) pkgconfig(xmlrpc_client) ( ) pkgconfig(json-c) ( ) pkgconfig(satyr) ( ) pkgconfig(libcurl) ( ) libreport-web ( =  2.17.14-2.el10)"
RPROVIDES:libreport-web-devel = "libreport-web-devel ( =  2.17.14-2.el10) libreport-web-devel(x86-64) ( =  2.17.14-2.el10) pkgconfig(libreport-web) ( =  2.17.14)"

URI_python3-libreport = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libreport-2.17.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libreport = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libarchive.so.13()(64bit) ( ) libreport.so.2()(64bit) ( ) libreport.so.2(LIBREPORT_2.13.1)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libsatyr.so.4()(64bit) ( ) libaugeas.so.0()(64bit) ( ) python3-dnf ( ) python3-requests ( ) python3-urllib3 ( ) python(abi) ( =  3.12) libreport ( =  2.17.14-2.el10)"
RPROVIDES:python3-libreport = "python3-libreport ( =  2.17.14-2.el10) python-libreport ( =  2.17.14-2.el10) python3-libreport(x86-64) ( =  2.17.14-2.el10) python3.12-libreport ( =  2.17.14-2.el10)"
