
PN = "openjpeg2"
PE = "0"
PV = "2.5.2"
PR = "4.el10_0.1"
PACKAGES = "openjpeg2 openjpeg2-devel openjpeg2-tools openjpeg2-devel-docs"


URI_openjpeg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openjpeg2-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:openjpeg2 = "libopenjp2.so.7()(64bit) ( ) openjpeg2 ( =  2.5.2-4.el10_0.1) openjpeg2(x86-64) ( =  2.5.2-4.el10_0.1)"

URI_openjpeg2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openjpeg2-devel-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libopenjp2.so.7()(64bit) ( ) openjpeg2(x86-64) ( =  2.5.2-4.el10_0.1) openjpeg2-tools(x86-64) ( =  2.5.2-4.el10_0.1)"
RPROVIDES:openjpeg2-devel = "cmake(OpenJPEG) ( =  2.5.2) cmake(openjpeg) ( =  2.5.2) pkgconfig(libopenjp2) ( =  2.5.2) openjpeg2-devel ( =  2.5.2-4.el10_0.1) openjpeg2-devel(x86-64) ( =  2.5.2-4.el10_0.1)"

URI_openjpeg2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openjpeg2-tools-2.5.2-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openjpeg2-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libopenjp2.so.7()(64bit) ( ) liblcms2.so.2()(64bit) ( ) openjpeg2(x86-64) ( =  2.5.2-4.el10_0.1)"
RPROVIDES:openjpeg2-tools = "openjpeg2-tools(x86-64) ( =  2.5.2-4.el10_0.1) openjpeg2-tools ( =  2.5.2-4.el10_0.1)"

URI_openjpeg2-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openjpeg2-devel-docs-2.5.2-4.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:openjpeg2-devel-docs = ""
RPROVIDES:openjpeg2-devel-docs = "openjpeg2-devel-docs ( =  2.5.2-4.el10_0.1)"
