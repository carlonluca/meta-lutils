# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get cgrc could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/cgrc/2.0.3"
SRC_URI += "git://github.com/carlonluca/cgrc.git;protocol=https;branch=master"
SRCREV = "d870e7560bad9b05767a3fb6c0877da397c579c3"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/anstream/0.3.2 \
    crate://crates.io/anstyle-parse/0.2.1 \
    crate://crates.io/anstyle-query/1.0.0 \
    crate://crates.io/anstyle-wincon/1.0.1 \
    crate://crates.io/anstyle/1.0.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/bit-set/0.5.3 \
    crate://crates.io/bit-vec/0.6.3 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.3.3 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.3.12 \
    crate://crates.io/clap_builder/4.3.12 \
    crate://crates.io/clap_derive/4.3.12 \
    crate://crates.io/clap_lex/0.5.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/directories/5.0.1 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/env_logger/0.9.3 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/fancy-regex/0.11.0 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/linux-raw-sys/0.4.3 \
    crate://crates.io/log/0.4.19 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/phf/0.11.2 \
    crate://crates.io/phf_generator/0.11.2 \
    crate://crates.io/phf_macros/0.11.2 \
    crate://crates.io/phf_shared/0.11.2 \
    crate://crates.io/proc-macro2/1.0.64 \
    crate://crates.io/quote/1.0.29 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-automata/0.3.3 \
    crate://crates.io/regex-syntax/0.7.4 \
    crate://crates.io/regex/1.9.1 \
    crate://crates.io/rustix/0.38.4 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/2.0.25 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.43 \
    crate://crates.io/thiserror/1.0.43 \
    crate://crates.io/unicode-ident/1.0.10 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.1 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://GPL-3.0;md5=generateme \
"

SUMMARY = "Configurable terminal text formatter"
HOMEPAGE = "https://bugfreeblog.duckdns.org/2022/09/cgrc-formatting-output-in-the-terminal.html"
LICENSE = "GPL-3.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include cgrc-${PV}.inc
include cgrc.inc