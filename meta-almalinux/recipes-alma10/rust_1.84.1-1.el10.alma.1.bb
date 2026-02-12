
inherit dnf-bridge

PN = "rust"
PE = "0"
PV = "1.84.1"
PR = "1.el10.alma.1"
PACKAGES = "cargo clippy rust rust-analyzer rust-debugger-common rust-doc rust-gdb rust-lldb rust-src rust-std-static rust-std-static-wasm32-unknown-unknown rust-std-static-wasm32-wasip1 rust-toolset rust-toolset-srpm-macros rustfmt rust-std-static-x86_64-unknown-none"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rust-1.84.1-1.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cargo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cargo-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cargo}"
RDEPENDS:cargo = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 sqlite-libs \
 libcurl \
 glibc \
 rust \
"

URI_clippy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clippy-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clippy}"
RDEPENDS:clippy = " \
 glibc \
 cargo \
 libgcc \
 rust \
"

URI_rust = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rust}"
RDEPENDS:rust = " \
 rust-std-static \
 libgcc \
 libstdc++ \
 gcc \
 glibc \
 llvm-libs \
"

URI_rust-analyzer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-analyzer-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rust-analyzer}"
RDEPENDS:rust-analyzer = " \
 glibc \
 libgcc \
 rust \
"

URI_rust-debugger-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-debugger-common-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-debugger-common}"
RDEPENDS:rust-debugger-common = ""

URI_rust-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-doc-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rust-doc}"
RDEPENDS:rust-doc = ""

URI_rust-gdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-gdb-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-gdb}"
RDEPENDS:rust-gdb = " \
 gdb \
 bash \
 rust-debugger-common \
"

URI_rust-lldb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-lldb-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-lldb}"
RDEPENDS:rust-lldb = " \
 python3-lldb \
 bash \
 lldb \
 rust-debugger-common \
"

URI_rust-src = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-src-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-src}"
RDEPENDS:rust-src = ""

URI_rust-std-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rust-std-static}"
RDEPENDS:rust-std-static = " \
 glibc \
 glibc-devel \
 libgcc \
 rust \
"

URI_rust-std-static-wasm32-unknown-unknown = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-wasm32-unknown-unknown-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-std-static-wasm32-unknown-unknown}"
RDEPENDS:rust-std-static-wasm32-unknown-unknown = " \
 lld \
 rust \
"

URI_rust-std-static-wasm32-wasip1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-std-static-wasm32-wasip1-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-std-static-wasm32-wasip1}"
RDEPENDS:rust-std-static-wasm32-wasip1 = " \
 lld \
 rust \
"

URI_rust-toolset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-toolset-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-toolset}"
RDEPENDS:rust-toolset = " \
 python3 \
 cargo \
 rust \
 rust-toolset-srpm-macros \
"

URI_rust-toolset-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rust-toolset-srpm-macros-1.84.1-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_rust-toolset-srpm-macros}"
RDEPENDS:rust-toolset-srpm-macros = ""

URI_rustfmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rustfmt-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rustfmt}"
RDEPENDS:rustfmt = " \
 glibc \
 cargo \
 libgcc \
 rust \
"

URI_rust-std-static-x86_64-unknown-none = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rust-std-static-x86_64-unknown-none-1.84.1-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rust-std-static-x86_64-unknown-none}"
RDEPENDS:rust-std-static-x86_64-unknown-none = " \
 lld \
 rust \
"
