
PN = "pcsc-lite"
PE = "0"
PV = "2.2.3"
PR = "2.el10"
PACKAGES = "pcsc-lite pcsc-lite-libs pcsc-lite-devel pcsc-lite-doc"


URI_pcsc-lite = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) polkit ( ) python3 ( ) libpolkit-gobject-1.so.0()(64bit) ( ) pcsc-ifd-handler ( ) pcsc-lite-libs ( =  2.2.3-2.el10)"
RPROVIDES:pcsc-lite = "bundled(simclist) ( =  1.6) pcsc-lite ( =  2.2.3-2.el10) pcsc-lite(x86-64) ( =  2.2.3-2.el10)"

URI_pcsc-lite-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-libs-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:pcsc-lite-libs = "libpcsclite.so.1()(64bit) ( ) libpcsclite_real.so.1()(64bit) ( ) pcsc-lite-libs ( =  2.2.3-2.el10) pcsc-lite-libs(x86-64) ( =  2.2.3-2.el10)"

URI_pcsc-lite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcsc-lite-devel-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/pkg-config ( ) libpcsclite.so.1()(64bit) ( ) libpcsclite_real.so.1()(64bit) ( ) pcsc-lite-libs ( =  2.2.3-2.el10)"
RPROVIDES:pcsc-lite-devel = "libpcscspy.so.0()(64bit) ( ) pcsc-lite-devel ( =  2.2.3-2.el10) pcsc-lite-devel(x86-64) ( =  2.2.3-2.el10) pkgconfig(libpcsclite) ( =  2.2.3)"

URI_pcsc-lite-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pcsc-lite-doc-2.2.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:pcsc-lite-doc = "pcsc-lite-libs ( =  2.2.3-2.el10)"
RPROVIDES:pcsc-lite-doc = "pcsc-lite-doc ( =  2.2.3-2.el10)"
