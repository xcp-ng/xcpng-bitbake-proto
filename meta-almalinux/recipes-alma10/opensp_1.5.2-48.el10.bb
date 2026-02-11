
PN = "opensp"
PE = "0"
PV = "1.5.2"
PR = "48.el10"
PACKAGES = "opensp opensp-devel"


URI_opensp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensp-1.5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) sgml-common ( >=  0.5)"
RPROVIDES:opensp = "libosp.so.5()(64bit) ( ) opensp ( =  1.5.2-48.el10) bundled(gettext) ( =  0.14.5) opensp(x86-64) ( =  1.5.2-48.el10)"

URI_opensp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensp-devel-1.5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensp-devel = "libosp.so.5()(64bit) ( ) opensp ( =  1.5.2-48.el10)"
RPROVIDES:opensp-devel = "opensp-devel ( =  1.5.2-48.el10) opensp-devel(x86-64) ( =  1.5.2-48.el10)"
