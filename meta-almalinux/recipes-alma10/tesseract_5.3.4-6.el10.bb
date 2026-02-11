
PN = "tesseract"
PE = "0"
PV = "5.3.4"
PR = "6.el10"
PACKAGES = "tesseract tesseract-devel tesseract-tools"


URI_tesseract = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libcurl.so.4()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) tesseract-langpack-eng ( ) libleptonica.so.6()(64bit) ( )"
RPROVIDES:tesseract = "libtesseract.so.5.3.4()(64bit) ( ) tesseract ( =  5.3.4-6.el10) tesseract(x86-64) ( =  5.3.4-6.el10)"

URI_tesseract-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tesseract-devel-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(lept) ( ) libtesseract.so.5.3.4()(64bit) ( ) tesseract(x86-64) ( =  5.3.4-6.el10)"
RPROVIDES:tesseract-devel = "cmake(Tesseract) ( =  5.3.4) cmake(tesseract) ( =  5.3.4) pkgconfig(tesseract) ( =  5.3.4) tesseract-devel ( =  5.3.4-6.el10) tesseract-devel(x86-64) ( =  5.3.4-6.el10)"

URI_tesseract-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-tools-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libleptonica.so.6()(64bit) ( ) libicui18n.so.74()(64bit) ( ) libicuuc.so.74()(64bit) ( ) libtesseract.so.5.3.4()(64bit) ( ) tesseract(x86-64) ( =  5.3.4-6.el10)"
RPROVIDES:tesseract-tools = "tesseract-tools ( =  5.3.4-6.el10) tesseract-tools(x86-64) ( =  5.3.4-6.el10)"
