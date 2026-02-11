
PN = "iio-sensor-proxy"
PE = "0"
PV = "3.5"
PR = "5.el10"
PACKAGES = "iio-sensor-proxy iio-sensor-proxy-docs"


URI_iio-sensor-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iio-sensor-proxy-3.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iio-sensor-proxy = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( )"
RPROVIDES:iio-sensor-proxy = "iio-sensor-proxy ( =  3.5-5.el10) iio-sensor-proxy(x86-64) ( =  3.5-5.el10)"

URI_iio-sensor-proxy-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iio-sensor-proxy-docs-3.5-5.el10.noarch.rpm;unpack=0"
RDEPENDS:iio-sensor-proxy-docs = ""
RPROVIDES:iio-sensor-proxy-docs = "iio-sensor-proxy-docs ( =  3.5-5.el10)"
