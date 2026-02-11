
PN = "mpdecimal"
PE = "0"
PV = "2.5.1"
PR = "12.el10"
PACKAGES = "mpdecimal mpdecimal++ mpdecimal-devel mpdecimal-doc"


URI_mpdecimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mpdecimal-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:mpdecimal = "libmpdec.so.3()(64bit) ( ) mpdecimal ( =  2.5.1-12.el10) mpdecimal(x86-64) ( =  2.5.1-12.el10)"

URI_mpdecimal++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal++-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal++ = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libmpdec.so.3()(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) mpdecimal(x86-64) ( =  2.5.1-12.el10)"
RPROVIDES:mpdecimal++ = "libmpdec++.so.3()(64bit) ( ) mpdecimal++(x86-64) ( =  2.5.1-12.el10) mpdecimal++ ( =  2.5.1-12.el10)"

URI_mpdecimal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal-devel-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal-devel = "libmpdec.so.3()(64bit) ( ) libmpdec++.so.3()(64bit) ( ) mpdecimal(x86-64) ( =  2.5.1-12.el10) mpdecimal++(x86-64) ( =  2.5.1-12.el10)"
RPROVIDES:mpdecimal-devel = "mpdecimal-devel ( =  2.5.1-12.el10) mpdecimal-devel(x86-64) ( =  2.5.1-12.el10)"

URI_mpdecimal-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal-doc-2.5.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:mpdecimal-doc = ""
RPROVIDES:mpdecimal-doc = "bundled(js-jquery) ( =  3.4.1) bundled(js-underscore) ( =  1.3.1) mpdecimal-doc ( =  2.5.1-12.el10)"
