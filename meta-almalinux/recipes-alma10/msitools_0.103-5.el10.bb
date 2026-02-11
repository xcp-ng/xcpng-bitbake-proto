
PN = "msitools"
PE = "0"
PV = "0.103"
PR = "5.el10"
PACKAGES = "libmsi1 libmsi1-devel msitools"


URI_libmsi1 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmsi1-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmsi1 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgsf-1.so.114()(64bit) ( )"
RPROVIDES:libmsi1 = "libmsi-1.0.so.0()(64bit) ( ) libmsi1(x86-64) ( =  0.103-5.el10) libmsi1 ( =  0.103-5.el10)"

URI_libmsi1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmsi1-devel-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmsi1-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) libmsi-1.0.so.0()(64bit) ( ) libmsi1(x86-64) ( =  0.103-5.el10)"
RPROVIDES:libmsi1-devel = "libmsi1-devel ( =  0.103-5.el10) libmsi1-devel(x86-64) ( =  0.103-5.el10) pkgconfig(libmsi-1.0) ( =  0.103)"

URI_msitools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/msitools-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:msitools = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.3)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libmsi-1.0.so.0()(64bit) ( ) libgcab-1.0.so.0()(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) ( ) libmsi1(x86-64) ( =  0.103-5.el10) libgsf ( >=  1.14.24-2)"
RPROVIDES:msitools = "msitools ( =  0.103-5.el10) msitools(x86-64) ( =  0.103-5.el10)"
