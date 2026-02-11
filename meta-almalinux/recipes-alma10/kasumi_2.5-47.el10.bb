
PN = "kasumi"
PE = "0"
PV = "2.5"
PR = "47.el10"
PACKAGES = "kasumi-common kasumi-unicode"


URI_kasumi-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kasumi-common-2.5-47.el10.noarch.rpm;unpack=0"
RDEPENDS:kasumi-common = ""
RPROVIDES:kasumi-common = "kasumi-common ( =  2.5-47.el10) kasumi ( =  2.5-47.el10)"

URI_kasumi-unicode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kasumi-unicode-2.5-47.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kasumi-unicode = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.1)(64bit) ( ) libanthy-unicode.so.0()(64bit) ( ) libanthydic-unicode.so.0()(64bit) ( ) kasumi-common ( =  2.5-47.el10)"
RPROVIDES:kasumi-unicode = "kasumi-unicode ( =  2.5-47.el10) kasumi-unicode(x86-64) ( =  2.5-47.el10)"
