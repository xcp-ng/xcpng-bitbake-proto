
PN = "rust"
PE = "0"
PV = "1.84.1"
PR = "1.el10.alma.1"
PACKAGES = "cargo clippy rust rust-analyzer rust-debugger-common rust-doc rust-gdb rust-lldb rust-src rust-std-static rust-std-static-wasm32-unknown-unknown rust-std-static-wasm32-wasip1 rust-toolset rust-toolset-srpm-macros rustfmt rust-std-static-x86_64-unknown-none"


URI_cargo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cargo-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cargo = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) libz.so.1(ZLIB_1.2.3.4)(64bit) ( ) rust ( )"
RPROVIDES:cargo = "cargo ( =  1.84.1-1.el10.alma.1) bundled(libgit2) ( =  1.8.1) cargo(x86-64) ( =  1.84.1-1.el10.alma.1) cargo-vendor ( =  1.84.1-1.el10.alma.1)"

URI_clippy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clippy-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:clippy = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) cargo ( ) rust(x86-64) ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:clippy = "clippy ( =  1.84.1-1.el10.alma.1) clippy(x86-64) ( =  1.84.1-1.el10.alma.1) clippy-preview ( =  1.84.1-1.el10.alma.1)"

URI_rust = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rust = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) /usr/bin/cc ( ) rust-std-static(x86-64) ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust = "rust ( =  1.84.1-1.el10.alma.1) rust(x86-64) ( =  1.84.1-1.el10.alma.1) rustc ( =  1.84.1-1.el10.alma.1) rustc(x86-64) ( =  1.84.1-1.el10.alma.1)"

URI_rust-analyzer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-analyzer-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rust-analyzer = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) rust(x86-64) ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust-analyzer = "rust-analyzer ( =  1.84.1-1.el10.alma.1) rust-analyzer(x86-64) ( =  1.84.1-1.el10.alma.1)"

URI_rust-debugger-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-debugger-common-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-debugger-common = ""
RPROVIDES:rust-debugger-common = "rust-debugger-common ( =  1.84.1-1.el10.alma.1)"

URI_rust-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-doc-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rust-doc = ""
RPROVIDES:rust-doc = "cargo-doc ( =  1.84.1-1.el10.alma.1) rust-doc ( =  1.84.1-1.el10.alma.1) rust-doc(x86-64) ( =  1.84.1-1.el10.alma.1)"

URI_rust-gdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-gdb-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-gdb = "/usr/bin/sh ( ) gdb ( ) rust-debugger-common ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust-gdb = "rust-gdb ( =  1.84.1-1.el10.alma.1)"

URI_rust-lldb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-lldb-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-lldb = "/usr/bin/sh ( ) python3-lldb ( ) lldb ( ) rust-debugger-common ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust-lldb = "rust-lldb ( =  1.84.1-1.el10.alma.1)"

URI_rust-src = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-src-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-src = ""
RPROVIDES:rust-src = "rust-src ( =  1.84.1-1.el10.alma.1)"

URI_rust-std-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rust-std-static = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) rust ( =  1.84.1-1.el10.alma.1) glibc-devel(x86-64) ( >=  2.17)"
RPROVIDES:rust-std-static = "rust-std-static(x86-64) ( =  1.84.1-1.el10.alma.1) rust-std-static ( =  1.84.1-1.el10.alma.1) rust-std-static-x86_64-unknown-linux-gnu ( =  1.84.1-1.el10.alma.1)"

URI_rust-std-static-wasm32-unknown-unknown = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-wasm32-unknown-unknown-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-std-static-wasm32-unknown-unknown = "rust ( =  1.84.1-1.el10.alma.1) lld ( >=  8.0)"
RPROVIDES:rust-std-static-wasm32-unknown-unknown = "rust-std-static-wasm32-unknown-unknown ( =  1.84.1-1.el10.alma.1)"

URI_rust-std-static-wasm32-wasip1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-wasm32-wasip1-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-std-static-wasm32-wasip1 = "rust ( =  1.84.1-1.el10.alma.1) lld ( >=  8.0)"
RPROVIDES:rust-std-static-wasm32-wasip1 = "bundled(wasi-libc) ( ) rust-std-static-wasm32-wasip1 ( =  1.84.1-1.el10.alma.1)"

URI_rust-toolset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-toolset-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-toolset = "/usr/bin/python3 ( ) rust ( =  1.84.1-1.el10.alma.1) cargo ( =  1.84.1-1.el10.alma.1) rust-toolset-srpm-macros ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust-toolset = "rpm_macro(build_rustflags) ( ) rpm_macro(cargo_build) ( ) rpm_macro(cargo_install) ( ) rpm_macro(cargo_license) ( ) rpm_macro(cargo_license_summary) ( ) rpm_macro(cargo_prep) ( ) rpm_macro(cargo_test) ( ) rpm_macro(cargo_vendor_manifest) ( ) rpm_macro(rustflags_codegen_units) ( ) rpm_macro(rustflags_debuginfo) ( ) rpm_macro(rustflags_opt_level) ( ) rust-toolset ( =  1.84.1-1.el10.alma.1)"

URI_rust-toolset-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-toolset-srpm-macros-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rust-toolset-srpm-macros = ""
RPROVIDES:rust-toolset-srpm-macros = "rpm_macro(crates_source) ( ) rpm_macro(rust_arches) ( ) rpm_macro(version_no_tilde) ( ) rust-toolset-srpm-macros ( =  1.84.1-1.el10.alma.1) rust-srpm-macros ( =  25.2)"

URI_rustfmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rustfmt-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rustfmt = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) cargo ( ) rust(x86-64) ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rustfmt = "rustfmt ( =  1.84.1-1.el10.alma.1) rustfmt(x86-64) ( =  1.84.1-1.el10.alma.1) rustfmt-preview ( =  1.84.1-1.el10.alma.1)"

URI_rust-std-static-x86_64-unknown-none = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rust-std-static-x86_64-unknown-none-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rust-std-static-x86_64-unknown-none = "lld ( ) rust ( =  1.84.1-1.el10.alma.1)"
RPROVIDES:rust-std-static-x86_64-unknown-none = "rust-std-static-x86_64-unknown-none ( =  1.84.1-1.el10.alma.1) rust-std-static-x86_64-unknown-none(x86-64) ( =  1.84.1-1.el10.alma.1)"
