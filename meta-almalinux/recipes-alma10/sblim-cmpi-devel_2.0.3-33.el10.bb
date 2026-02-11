
PN = "sblim-cmpi-devel"
PE = "0"
PV = "2.0.3"
PR = "33.el10"
PACKAGES = "libcmpiCppImpl0 sblim-cmpi-devel"


URI_libcmpiCppImpl0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcmpiCppImpl0-2.0.3-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcmpiCppImpl0 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( )"
RPROVIDES:libcmpiCppImpl0 = "libcmpiCppImpl.so.0()(64bit) ( ) libcmpiCppImpl0 ( =  2.0.3-33.el10) libcmpiCppImpl0(x86-64) ( =  2.0.3-33.el10)"

URI_sblim-cmpi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sblim-cmpi-devel-2.0.3-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-cmpi-devel = ""
RPROVIDES:sblim-cmpi-devel = "rpm_macro(sblim_post) ( ) rpm_macro(sblim_pre) ( ) rpm_macro(sblim_preun) ( ) sblim-cmpi-devel ( =  2.0.3-33.el10) sblim-cmpi-devel(x86-64) ( =  2.0.3-33.el10)"
