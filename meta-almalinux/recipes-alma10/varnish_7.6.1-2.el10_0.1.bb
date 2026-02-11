
PN = "varnish"
PE = "0"
PV = "7.6.1"
PR = "2.el10_0.1"
PACKAGES = "varnish varnish-docs varnish-devel"


URI_varnish = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/varnish-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:varnish = "/bin/sh ( ) shadow-utils ( ) systemd-units ( ) systemd-sysv ( ) /usr/bin/uuidgen ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) gcc ( ) libtinfo.so.6()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) redhat-rpm-config ( ) libncursesw.so.6()(64bit) ( ) logrotate ( ) libedit.so.0()(64bit) ( ) ncurses ( ) pcre2 ( )"
RPROVIDES:varnish = "libvarnishapi.so.3()(64bit) ( ) libvarnishapi.so.3(LIBVARNISHAPI_3.0)(64bit) ( ) libvarnishapi.so.3(LIBVARNISHAPI_3.1)(64bit) ( ) varnishd(abi)(x86-64) ( =  ed1243ca162a7b1d975bc0332f0d66d33f0bc78e) varnishd(vrt)(x86-64) ( =  20.0) config(varnish) ( =  7.6.1-2.el10_0.1) varnish ( =  7.6.1-2.el10_0.1) varnish(x86-64) ( =  7.6.1-2.el10_0.1) vmod(blob)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(cookie)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(debug)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(directors)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(h2)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(proxy)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(purge)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(std)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(unix)(x86-64) ( =  7.6.1-2.el10_0.1) vmod(vtc)(x86-64) ( =  7.6.1-2.el10_0.1)"

URI_varnish-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/varnish-docs-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:varnish-docs = ""
RPROVIDES:varnish-docs = "varnish-docs ( =  7.6.1-2.el10_0.1) varnish-docs(x86-64) ( =  7.6.1-2.el10_0.1)"

URI_varnish-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/varnish-devel-7.6.1-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:varnish-devel = "/usr/bin/pkg-config ( ) /usr/bin/python3 ( ) python3 ( ) libvarnishapi.so.3()(64bit) ( ) varnish ( =  7.6.1-2.el10_0.1)"
RPROVIDES:varnish-devel = "pkgconfig(varnishapi) ( =  7.6.1) varnish-devel ( =  7.6.1-2.el10_0.1) varnish-devel(x86-64) ( =  7.6.1-2.el10_0.1) varnish-libs-devel ( =  7.6.1-2.el10_0.1)"
