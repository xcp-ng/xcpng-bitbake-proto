
PN = "libnma"
PE = "0"
PV = "1.10.6"
PR = "9.el10"
PACKAGES = "libnma libnma-gtk4 libnma-devel libnma-gtk4-devel"


URI_libnma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnma-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libnm.so.0(libnm_1_2_0)(64bit) ( ) libgck-2.so.2()(64bit) ( ) libnm.so.0(libnm_1_8_0)(64bit) ( ) libnm.so.0(libnm_1_6_0)(64bit) ( ) mobile-broadband-provider-info ( >=  0.20090602)"
RPROVIDES:libnma = "libnma.so.0()(64bit) ( ) libnma.so.0(libnma_1_2_0)(64bit) ( ) libnma.so.0(libnma_1_8_0)(64bit) ( ) libnma.so.0(libnma_1_8_28)(64bit) ( ) libnma.so.0(libnma_1_8_36)(64bit) ( ) libnma.so.0(libnma_1_8_12)(64bit) ( ) libnma.so.0(libnma_1_8_20)(64bit) ( ) libnma.so.0(libnma_1_8_22)(64bit) ( ) libnma ( =  1.10.6-9.el10) libnma(x86-64) ( =  1.10.6-9.el10)"

URI_libnma-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnma-gtk4-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-gtk4 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libnm.so.0(libnm_1_2_0)(64bit) ( ) libgck-2.so.2()(64bit) ( ) libnm.so.0(libnm_1_8_0)(64bit) ( ) libnm.so.0(libnm_1_6_0)(64bit) ( ) mobile-broadband-provider-info ( >=  0.20090602) gtk4(x86-64) ( >=  4.16.7)"
RPROVIDES:libnma-gtk4 = "libnma-gtk4.so.0()(64bit) ( ) libnma-gtk4.so.0(libnma_1_2_0)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_28)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_0)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_12)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_20)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_22)(64bit) ( ) libnma-gtk4.so.0(libnma_1_8_36)(64bit) ( ) libnma-gtk4 ( =  1.10.6-9.el10) libnma-gtk4(x86-64) ( =  1.10.6-9.el10)"

URI_libnma-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnma-devel-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(libnm) ( ) gtk3-devel(x86-64) ( ) libnma.so.0()(64bit) ( ) NetworkManager-libnm-devel ( >=  1:1.8.0) libnma(x86-64) ( =  1.10.6-9.el10)"
RPROVIDES:libnma-devel = "libnma-devel ( =  1.10.6-9.el10) libnma-devel(x86-64) ( =  1.10.6-9.el10) pkgconfig(libnma) ( =  1.10.6)"

URI_libnma-gtk4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnma-gtk4-devel-1.10.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnma-gtk4-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(libnm) ( ) gtk4-devel(x86-64) ( ) libnma-gtk4.so.0()(64bit) ( ) NetworkManager-libnm-devel ( >=  1:1.8.0) libnma-gtk4(x86-64) ( =  1.10.6-9.el10)"
RPROVIDES:libnma-gtk4-devel = "libnma-gtk4-devel ( =  1.10.6-9.el10) libnma-gtk4-devel(x86-64) ( =  1.10.6-9.el10) pkgconfig(libnma-gtk4) ( =  1.10.6)"
