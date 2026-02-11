
PN = "ModemManager"
PE = "0"
PV = "1.22.0"
PR = "7.el10"
PACKAGES = "ModemManager ModemManager-glib ModemManager-devel ModemManager-glib-devel ModemManager-vala"


URI_ModemManager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ModemManager-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ModemManager = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) polkit ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libmm-glib.so.0()(64bit) ( ) libmbim-glib.so.4()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libqrtr-glib.so.0()(64bit) ( ) libmbim-utils ( ) libqmi-glib.so.5()(64bit) ( ) libqmi-utils ( ) ModemManager-glib(x86-64) ( =  1.22.0-7.el10)"
RPROVIDES:ModemManager = "libmm-shared-fibocom.so()(64bit) ( ) libmm-shared-foxconn.so()(64bit) ( ) libmm-shared-icera.so()(64bit) ( ) libmm-shared-novatel.so()(64bit) ( ) libmm-shared-option.so()(64bit) ( ) libmm-shared-sierra.so()(64bit) ( ) libmm-shared-telit.so()(64bit) ( ) libmm-shared-xmm.so()(64bit) ( ) ModemManager ( =  1.22.0-7.el10) ModemManager(x86-64) ( =  1.22.0-7.el10)"

URI_ModemManager-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ModemManager-glib-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ModemManager-glib = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) glib2 ( >=  2.80.4)"
RPROVIDES:ModemManager-glib = "libmm-glib.so.0()(64bit) ( ) ModemManager-glib(x86-64) ( =  1.22.0-7.el10) ModemManager-glib ( =  1.22.0-7.el10)"

URI_ModemManager-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ModemManager-devel-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ModemManager-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) ModemManager(x86-64) ( =  1.22.0-7.el10)"
RPROVIDES:ModemManager-devel = "ModemManager-devel(x86-64) ( =  1.22.0-7.el10) ModemManager-devel ( =  1.22.0-7.el10) pkgconfig(ModemManager) ( =  1.22.0)"

URI_ModemManager-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ModemManager-glib-devel-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ModemManager-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-unix-2.0) ( ) pkgconfig(ModemManager) ( ) libmm-glib.so.0()(64bit) ( ) ModemManager(x86-64) ( =  1.22.0-7.el10) ModemManager-devel(x86-64) ( =  1.22.0-7.el10) ModemManager-glib(x86-64) ( =  1.22.0-7.el10) glib2-devel ( >=  2.80.4) pkgconfig(glib-2.0) ( >=  2.56)"
RPROVIDES:ModemManager-glib-devel = "ModemManager-glib-devel ( =  1.22.0-7.el10) ModemManager-glib-devel(x86-64) ( =  1.22.0-7.el10) pkgconfig(mm-glib) ( =  1.22.0)"

URI_ModemManager-vala = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ModemManager-vala-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ModemManager-vala = "vala ( ) ModemManager-glib(x86-64) ( =  1.22.0-7.el10)"
RPROVIDES:ModemManager-vala = "ModemManager-vala ( =  1.22.0-7.el10) ModemManager-vala(x86-64) ( =  1.22.0-7.el10)"
