
PN = "enchant2"
PE = "0"
PV = "2.6.7"
PR = "3.el10"
PACKAGES = "enchant2 enchant2-voikko enchant2-devel"


URI_enchant2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/enchant2-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libhunspell-1.7.so.0()(64bit) ( )"
RPROVIDES:enchant2 = "bundled(gnulib) ( ) libenchant-2.so.2()(64bit) ( ) enchant2(x86-64) ( =  2.6.7-3.el10) enchant2 ( =  2.6.7-3.el10)"

URI_enchant2-voikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/enchant2-voikko-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2-voikko = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libenchant-2.so.2()(64bit) ( ) libvoikko.so.1()(64bit) ( ) enchant2(x86-64) ( =  2.6.7-3.el10)"
RPROVIDES:enchant2-voikko = "enchant2-voikko ( =  2.6.7-3.el10) enchant2-voikko(x86-64) ( =  2.6.7-3.el10)"

URI_enchant2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/enchant2-devel-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) glib2-devel ( ) pkgconfig(gmodule-no-export-2.0) ( ) libenchant-2.so.2()(64bit) ( ) enchant2(x86-64) ( =  2.6.7-3.el10)"
RPROVIDES:enchant2-devel = "enchant2-devel ( =  2.6.7-3.el10) enchant2-devel(x86-64) ( =  2.6.7-3.el10) pkgconfig(enchant-2) ( =  2.6.7)"
