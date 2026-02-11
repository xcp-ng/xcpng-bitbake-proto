
PN = "espeak-ng"
PE = "0"
PV = "1.51.1"
PR = "10.el10"
PACKAGES = "espeak-ng espeak-ng-devel espeak-ng-doc espeak-ng-vim"


URI_espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/espeak-ng-1.51.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:espeak-ng = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libpcaudio.so.0()(64bit) ( )"
RPROVIDES:espeak-ng = "libespeak-ng.so.1()(64bit) ( ) espeak-ng ( =  1.51.1-10.el10) espeak-ng(x86-64) ( =  1.51.1-10.el10)"

URI_espeak-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/espeak-ng-devel-1.51.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:espeak-ng-devel = "/usr/bin/pkg-config ( ) libespeak-ng.so.1()(64bit) ( ) espeak-ng(x86-64) ( =  1.51.1-10.el10)"
RPROVIDES:espeak-ng-devel = "espeak-ng-devel ( =  1.51.1-10.el10) espeak-ng-devel(x86-64) ( =  1.51.1-10.el10) pkgconfig(espeak-ng) ( =  1.51.1)"

URI_espeak-ng-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/espeak-ng-doc-1.51.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:espeak-ng-doc = "espeak-ng ( =  1.51.1-10.el10)"
RPROVIDES:espeak-ng-doc = "espeak-ng-doc ( =  1.51.1-10.el10)"

URI_espeak-ng-vim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/espeak-ng-vim-1.51.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:espeak-ng-vim = "espeak-ng ( =  1.51.1-10.el10)"
RPROVIDES:espeak-ng-vim = "espeak-ng-vim ( =  1.51.1-10.el10)"
